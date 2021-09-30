function pattern(n){
    for(var i=n;i>0;--i){
        var arr=[];
        for(var j=1;j<=i;++j){
            arr.push('*');
        }
        console.log(arr.join(''));
    }
}

pattern(5);