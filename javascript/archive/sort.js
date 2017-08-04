var array = [2,1,4,5, 10, 8, -2];
console.log(10<2)

function swap(a,b){
    return [b,a];
}

function trier(array){
    var k=array.length;
    var flag=true;
    while (flag==true){

        for (var j=0;j<k;j++){
            flag=false;
            for (var i=0;i<k-j;i++) {

                if (array[i]>array[i+1]) {

                    [array[i],array[i+1]]=swap(array[i],array[i+1]);
                    flag=true;
                }
            }
        }
    }
        
return array;
}

console.log(trier(array))
