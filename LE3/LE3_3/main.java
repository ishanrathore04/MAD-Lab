/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
  public static void main (String[]args)
  {
    RD rd = new RD ();
      rd.name_display ();
      rd.swim ();
    WD wd = new WD ();
      wd.name_display ();
      wd.swim ();
    RHD rhd = new RHD ();
      rhd.name_display ();
      rhd.swim ();
      rhd.fly ();
      rhd.quack ();
    LD ld = new LD ();
      ld.name_display ();
      ld.swim ();
      ld.fly ();
      ld.quack ();
  }
}
