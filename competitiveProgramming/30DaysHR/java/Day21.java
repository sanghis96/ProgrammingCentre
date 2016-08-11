import java.lang.reflect.Method;

class Day21
{
    private static <E> void printArray(E[] list)
    {
        for(int i=0; i<list.length; i++)
            System.out.println(list[i]);
    }
    public static void main(String args[])
    {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}
