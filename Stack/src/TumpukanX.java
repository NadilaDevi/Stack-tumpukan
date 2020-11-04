//mendemonstrasikan tumpukan dengan array

class TumpukanX {
    private int ukuranMaks; //ukuran array tumpukan
    private long[] arrayTumpukan;
    private int atas; //atas tumpukans
    
    //----------------------------------------------------------------------
    public TumpukanX(int s){ //konstruktor
        ukuranMaks = s; //menetapkan ukuran aray
        arrayTumpukan = new long[ukuranMaks]; //menciptakan array
        atas = -1; //belum ada item  
    }
    //------------------------------------------------------------------------
    public void push(long j) { //menempatkan item di atas tumpukan
       arrayTumpukan[++atas] = j;  //menginkremen atas, sisip item
    }
    //------------------------------------------------------------------------
    public long pop(){ //menghapus item dari atas tumpukan
       return arrayTumpukan[atas--]; //mengakses item, mendekremen atas
    }
    //------------------------------------------------------------------------
    public long peek(){ //mengintip ke atas tumpukan
       return arrayTumpukan[atas]; 
    }
    //-----------------------------------------------------------------------
    public boolean apaKosong(){ //true jika tumpukan kosong
        return (atas == -1);
    }
    public boolean apaPenuh(){ //true jika tumpukan penuh
        return (atas == ukuranMaks-1);
    }  
} //akhir kelas Tumpukan

class UjiTumpukan {
    public static void main(String[] args){
        TumpukanX tumpukan = new TumpukanX(10); //menciptakan tumpukan
        tumpukan.push(20);
        tumpukan.push(40);
        tumpukan.push(60);
        tumpukan.push(80);
    
        while( !tumpukan.apaKosong()){ //sampai kosong
            //menghapus item dari tumpukan
            long nilai = tumpukan.pop();
            System.out.print(nilai); //menampilkannya
            System.out.print(" ");
        } //akhir while
        
        System.out.println("");
    } //akhir main ()
} // akhir kelas UjiTumpukan