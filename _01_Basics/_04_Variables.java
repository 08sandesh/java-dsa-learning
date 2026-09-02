package _01_Basics;

public class _04_Variables {
    public static void main(String[] args){

        int a;   // Declaration (can be done only one time)
        a = 10;  // Initialization
        System.out.print(a + " ");

        int b = 20;  // Declaration and Initialization ek sath
        System.out.println(b);

        a = a + 2;  // Modify/Update
        System.out.println(a);
        System.out.println();
        
        System.out.println("Variable naming rules: \n");
        System.out.println("1. Variables can start from alphabet or _ or $");
        System.out.println("2. Special chracters except _ and $ are not allowed");
        System.out.println("3. Blanks,commas not allowed");
        System.out.println("4. Keywords not allowed");
        System.out.println();
        
        System.out.println("Following are the keywords in java: ");
        System.out.println("abstract\r\n" + //
                        "assert\r\n" + //
                        "boolean\r\n" + //
                        "break\r\n" + //
                        "byte\r\n" + //
                        "case\r\n" + //
                        "catch\r\n" + //
                        "char\r\n" + //
                        "class\r\n" + //
                        "const\r\n" + //
                        "continue\r\n" + //
                        "default\r\n" + //
                        "do\r\n" + //
                        "double\r\n" + //
                        "else\r\n" + //
                        "enum\r\n" + //
                        "extends\r\n" + //
                        "final\r\n" + //
                        "finally\r\n" + //
                        "float\r\n" + //
                        "for\r\n" + //
                        "goto\r\n" + //
                        "if\r\n" + //
                        "implements\r\n" + //
                        "import\r\n" + //
                        "instanceof\r\n" + //
                        "int\r\n" + //
                        "interface\r\n" + //
                        "long\r\n" + //
                        "native\r\n" + //
                        "new\r\n" + //
                        "package\r\n" + //
                        "private\r\n" + //
                        "protected\r\n" + //
                        "public\r\n" + //
                        "return\r\n" + //
                        "short\r\n" + //
                        "static\r\n" + //
                        "strictfp\r\n" + //
                        "super\r\n" + //
                        "switch\r\n" + //
                        "synchronized\r\n" + //
                        "this\r\n" + //
                        "throw\r\n" + //
                        "throws\r\n" + //
                        "transient\r\n" + //
                        "try\r\n" + //
                        "void\r\n" + //
                        "volatile\r\n" + //
                        "while");

    }

}
