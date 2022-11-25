public static void main(String[] args) {
    int n1 = 0;
    int n2;
    Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
    n1=sc.nextInt();
        System.out.println("Insira o segundo numero: ");
    n2 = sc.nextInt();
    
    if (n1>n2){
        System.out.println("O maior numero e o primeiro");
    } else{
        System.out.println("O maior numero e o segundo");
    }
    }
