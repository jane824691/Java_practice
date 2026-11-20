public class DataTypeVariable {
    public static void main(String[] args){
        // 在終端機印出各種資料型態
        // 整數，預設是 int
        int x;
        x = 3;
        // 也可以寫成 int x = 3;，直接在宣告時給值
        System.out.println(x);
        System.out.println(10);
        // 長整數，數字後面需要特別加上 L
        System.out.println(10000000000L);
        // 或是進行宣告 long 型態的變數
        long y = 33000000000L;
        System.out.println(y);

        // 浮點數，預設是 double 型態
        System.out.println(3.14159268);
        double z = 3.14159268;
        System.out.println(z);
        // 單精度浮點數，數字後面需要特別加上 F
        System.out.println(3.14159268F);
        float f = 3.14159268F;
        System.out.println(f);
        // 布林值
        boolean b = true;
        System.out.println("當 b 等於" + b);
        System.out.println("b + !不等於 " + !b);
        // 字元，單引號
        System.out.println('A');
        char c = 'C';
        System.out.println(c);
        // 字串，雙引號
        System.out.println("Hello World");
        String s = "Hello the World";
        System.out.println(s);
    }
    // 終端機：
    // javac DataTypeVariable.java = 編譯java且會生成DataTypeVariable.class檔案
    // java DataTypeVariable = 執行DataTypeVariable.class檔案
}