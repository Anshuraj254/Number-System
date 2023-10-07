class loading
{
    public  void Animation () throws InterruptedException
    {
    String s="****loading****";
    String t="loading completed !";
    for(int i = 0; i<s.length(); i++)
    {
        Thread.sleep(300);
        System.out.print(s.charAt(i));
    }
    System.out.println("          ");
    for(int l = 0; l<t.length(); l++)
    {
        Thread.sleep(300);
        System.out.print(t.charAt(l));
    }
    }
}
