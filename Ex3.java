importar  java . . _ Scanner ;

 classe  pública Ex3 {

  public  static  void  principal ( String [] args ) {
    Scanner  ler = novo  Scanner ( System . in );
    Sistema . fora . println ( "Informe seu nome: " );
    String  nome = ler . proximaLinha ();
    Sistema . fora . println ( "Informe a sua idade: " );
    int  idade = ler . proximoInt ();
    Sistema . fora . println ( "Olá " + nome + ", sua idade é " + idade );
  }
}
