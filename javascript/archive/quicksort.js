function quicksort(array){
    if (array.length<=1) return array;
    else {
        const gauche =[];
        const droite =[];
        for (var i=1;i<array.length;i++){
            if (array[i]<array[0]) gauche.push(array[i]);
            else droite.push(array[i]);
        }
        console.log(quicksort(gauche));
        console.log(quicksort(droite));
        return quicksort(gauche).concat(array[0]).concat(droite);
    }
}

var array1 =[5,1,2,6,7,9,-5];

console.log(quicksort(array1));