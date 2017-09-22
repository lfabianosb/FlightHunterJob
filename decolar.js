var casper = require("casper").create({
    pageSettings: {
        loadImages:  false,
        loadPlugins: false,
        userAgent:   'Mozilla/5.0 (Windows NT 6.1; rv:53.0) Gecko/20100101 Firefox/53.0'
    },
    logLevel: "info",
    verbose: false,
    viewportSize: {
        width: 800,
        height: 600
    }
});

var target = casper.cli.get(0);
var flight = {};

casper.start(target, function() {
    this.wait(30000, function() {

        var voo = this.evaluate(function() {
            return document.querySelector('#clusters > span:nth-child(1) > span:nth-child(1) > cluster:nth-child(1) > div:nth-child(1) > div:nth-child(2) > fare:nth-child(2) > div:nth-child(1) > span:nth-child(1) > span:nth-child(1) > div:nth-child(1) > ul:nth-child(3) > item-fare:nth-child(2) > li:nth-child(1) > span:nth-child(2) > flights-price:nth-child(1) > span:nth-child(1) > flights-price-element:nth-child(1) > span:nth-child(1) > span:nth-child(1) > em:nth-child(1) > span:nth-child(2)');
        });

        if (voo) {
            flight.valor = voo.textContent.trim().replace('.','').replace(',','.');
        } else {
            flight.msg = 'Voo não encontrado'
        }

        console.log(JSON.stringify(flight, null, null));

        /*
        if (voo) {
            flight.valor = voo.textContent.trim().substring(2).replace('.','').replace(',','.');
            var cia = this.evaluate(function() {
                return document.querySelector('.EIGTDNC-d-t div.EIGTDNC-d-Ab').parentNode.parentNode.parentNode.childNodes[1].childNodes[2];
            });
            var escalas = this.evaluate(function() {
                return document.querySelector('.EIGTDNC-d-t div.EIGTDNC-d-Ab').parentNode.parentNode.parentNode.childNodes[3].childNodes[0];
            });
            var duracao = this.evaluate(function() {
                return document.querySelector('.EIGTDNC-d-t div.EIGTDNC-d-Ab').parentNode.parentNode.parentNode.childNodes[2].childNodes[0];
            });


            if (cia) {
                flight.cia = cia.textContent;
                if (escalas) {
                    flight.escalas = escalas.textContent;
                }
                if (duracao) {
                    flight.duracaoIda = duracao.textContent;
                }
            } else {
                flight.msg = 'Companhia aérea não encontrada'
            }
        } else {
            flight.msg = 'Voo não encontrado'
            console.log(this.getHTML());
        }

        console.log(JSON.stringify(flight, null, null));
        */
    });
});

casper.run();