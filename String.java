class String{
    
public Static void main(String args[])
{
String a="hai how hi";
String[]b=a.split("");
int c=b.length;
for(int i=0;i<c;i++){
char[] d=a[i].toCharArray();
int e=d.length;
for(int j=0;j<e;j++)
{
if(d[i]==d[i+1])
{
char v=d[i];
}
}

}
System.out.println(d[i]);
}

    private String[] split(java.lang.String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}