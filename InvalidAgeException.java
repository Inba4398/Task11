package Task11;

public class InvalidAgeException extends Exception
{
// Declare a parameterized exception with string str as a parameter.
   InvalidAgeException(String str)
   {
      super(str);
   }
}
