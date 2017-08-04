const cardMax = 14;

let pot = 0;

let oop = {
    money: 1000
};

let ip = {
    money: 1000
};

function randomCard() {

    // http://stackoverflow.com/questions/4959975/
    return Math.floor(Math.random() * cardMax) + 1
}

function enter(player) {
    player.money = player.money - 1;
    pot = pot + 1;
    player.card = randomCard();
}

function bet() {
    oop.money = oop.money - 1;
    oop.move = "BET";
    pot = pot + 1;
}

function call() {
    ip.money = ip.money - 1;
    ip.move = "CALL";
    pot = pot + 1;
}
function fold(player) {
    // it's always ip that fold
    // You don't loose anything by folding
    player.move = "FOLD";

    player.card = -1;

}
function results() {

    // TODO !  if then else

    if (oop.card > ip.card || ip.move === 'FOLD') {
        oop.money += pot;
    }
    else ip.money += pot;
    //console.log(pot, oop, ip);

}

function gameIpVersusManiac(oopCallLimit, ipCallLimit = 4) {
    pot = 0;
    enter(oop);
    enter(ip);
    // If always bet
    if (oop.card >= oopCallLimit ) {
        bet(oop);

        if (ip.card >= ipCallLimit){
            call();
        }
        else {
            fold(ip);
        }

    }
    else{
        fold(oop);
    }

    results();
}



function simulation() {

    // we are looking for ip best strategy against a maniac

    let ipResult = [];
    let oopResult = [];
    // let altResult = {};



    for (let limit = 1; limit <= 14; limit++) {

        ip.money = 1000;

        oop.money = 1000;

        for (let i = 0; i < 1000000; i++) { // up to 1M

            gameIpVersusManiac(limit);

        }

        ipResult[limit] = ip.money;
        oopResult[limit] = oop.money;



        // altResult[limit+":"]=ip.money;

    }



    console.log(ipResult);
    console.log(oopResult);


}



simulation();



// What is the best call strategy ? Display alt results

// What is a good enough bet strategy ?

// What if ip bet value changes to pot size ? to twice the pot size ?