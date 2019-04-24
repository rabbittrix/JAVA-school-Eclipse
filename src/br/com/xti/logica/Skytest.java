package br.com.xti.logica;

import java.util.Iterator;
import java.util.TreeMap;

function solution(A) {
    // write your code in JavaScript (Node.js 6.4.0)
    B = A.reduce((a,b)=>{
        if (b < 0) {
            return a;
        }
        a[b] = b;
        return a
    }, [])
    if (B.length === 0 ) {
        return 1; 
    }
    for (let i=1; i <B.length; i++){ 
       if (!(B[i])) {
           return i;
        }
    }
    return B.length; 
}
