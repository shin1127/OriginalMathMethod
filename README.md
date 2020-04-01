# OriginalMathMethod

# Introduction
ArrayList<>に格納された数について、それらの最小値・最大値・和・平均値などを算出するメソッドを作成した。<br>
（一部未完成）

# Background
<p>
Java 10においては、配列から最小値・最大値を1回の処理で取り出すメソッドや、配列に存在する数の総和を導くメソッドが存在しない。<br>
（少なくとも標準ライブラリであるMathクラスの中には存在しない。）<br>
 そのため、数的処理に関するコードを記述する時に非常に手間がかかるという問題がある。<br>
 そこで、自身の開発時に冗長なコードを繰り返し記述することを避けるべく、<br>
  コピー&ペースト、あるいは数的処理用クラスとしてソースコードに組み込むことを前提とした汎用性の高いコードを制作することを試みた。
  </p>
  

  
# Learning in the repositry

 
1. 引数が異なっていても、メソッドをオーバーロードできない場合があった。<br>
　具体的には、引数にArrayList<>を指定したとき、ジェネリクスが異なっていたとしても<br>
 （例：String, Integer）同一の引数として扱われ、コンパイルエラーとなる。<br>
　従って、以下のようなメソッドは両立できない。<br>
 </p>
 <p>
 
 > ジェネリクスの持つ型情報がコンパイル時にのみ存在し、実行時には消滅している(そのため上記２つのメソッドを区別できず、
 >  オーバーロードによって解決できない）という問題に起因しています。
 >  [Javaのジェネリクスの注意点](https://hacknote.jp/archives/17792/)
 
 ```java
     public double average(ArrayList<Integer> list) {
    	    int sumNumber = 0;
    	    double avgNumber = 0;
    	    for(int i : list) {
    		       sumNumber += i;
    	    }
    	    avgNumber = sumNumber / list.size();
    	    return avgNumber;
     }
 ```
 </p>
 <p>
 
 ```java
     public double average(ArrayList<Double> list) {
    	    double sumNumber = 0;
    	    double avgNumber = 0;
    	    for (double d : list) {
    		       sumNumber += d;
    	    }
    	    avgNumber = sumNumber / list.size();
    	    return avgNumber;
    }
 ```
 </p>
 <p>
 
2. Javaは静的型付けの言語であるため、戻り値の型を指定しなければならない。<br>
 従って、例えば総和を求めるメソッドを制作する場合であっても、整数の計算か、小数を含む数の計算かに留意し、<br>
 戻り値がint型、double型のそれぞれに対してメソッドを制作する必要がある。
 </p>

# Development environment
JDK 10.0.2
