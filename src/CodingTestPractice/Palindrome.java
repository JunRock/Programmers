package CodingTestPractice;
import org.python.util.PythonInterpreter;

public class Palindrome {
    private static PythonInterpreter interpreter;
    public static void main(String[] args) {
        interpreter=new PythonInterpreter();
        interpreter.execfile("HelloWorld.py");
    }
}
