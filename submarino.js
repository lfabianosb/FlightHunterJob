// Require puppeteer
const puppeteer = require('puppeteer');

const WAIT1 = process.env.WAIT1 || 22;
const WAIT2 = process.env.WAIT2 || 23;
const DELAY_CLICK = process.env.DELAY_CLICK || 750;
const TARGET = process.argv[2];

(async () => {
    let flight = {};

    const browser = await puppeteer.launch({ args: ['--no-sandbox'], headless: true });
    const page = await browser.newPage();

    try {
        await page.goto(TARGET, { timeout: 60000 });

        await page.waitFor(WAIT1 * 1000);

        try {
            let cia = await page.$eval('#flight000_img > div:nth-child(1) > label:nth-child(1) > p:nth-child(3)', obj => obj.textContent);
            flight.cia = cia.trim();
        } catch (err) {}
        
        try {
            let saidaIda = await page.$eval('#flight000_img > div:nth-child(1) > label:nth-child(1) > p:nth-child(4) > span:nth-child(1)', obj => obj.textContent);
            flight.horaSaidaIda = saidaIda.trim();
        } catch (err) {}

        try {
            let chegadaIda = await page.$eval('#flight000_img > div:nth-child(1) > label:nth-child(1) > p:nth-child(6) > span:nth-child(1) > span:nth-child(1)', obj => obj.textContent);
            flight.horaChegadaIda = chegadaIda.trim();
        } catch (err) {}

        try {
            let paradasIda = await page.$eval('#flight000_img > div:nth-child(1) > label:nth-child(1) > p:nth-child(5)', obj => obj.textContent);
            flight.paradasIda = paradasIda.trim();
        } catch (err) {}

        await page.click('li.priceGroupContainer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(6)', { delay: DELAY_CLICK });
        await page.waitFor(WAIT2 * 1000);
        
        let valor = await page.$eval('.totalPrice', obj => obj.textContent);
        if (valor && valor.length > 3) {
            let fltValorTotal = parseFloat(valor.trim().substring(3).replace('.','').replace(',','.'));
            flight.valorTotal = fltValorTotal;

            let taxaServico = await page.$eval('.summaryPriceList > li:nth-child(7) > span:nth-child(2)', obj => obj.textContent);
            if (taxaServico.length > 3) {
                let fltTaxaServico = parseFloat(taxaServico.trim().substring(3).replace('.','').replace(',','.'));
                flight.valorSemTaxaServico = fltValorTotal - fltTaxaServico;
            } else {
                flight.valorSemTaxaServico = fltValorTotal;
            }
        } else {
            flight.msg = 'Não foi possível encontrar o valor da passagem';
        }
    } catch (err) {
        flight.msg = 'Erro: ' + err;
    }

    console.log(JSON.stringify(flight, null, null));

    browser.close();
})();