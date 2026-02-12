/*
//Opgave 1
double balance;
String accountName = "Daud";

void deposit100(){
     balance += 100;
}

void withdraw(){
     balance -= 50;
}

void printBalance(){
    System.out.println(accountName + " " + balance);
}


void main(){
    deposit100();
    deposit100();
    withdraw();
    printBalance();
    System.out.println(balance);
}
 */
/*
//Opgave 2
int assignmentPoints = 0;
int examPoints = 0;
int projectPoints = 0;

void addAssignmentPoints(int points){
    assignmentPoints += points;
}

void addExamPoints(int points){
    examPoints += points;
}

void addProjectPoints(int points){
    projectPoints += points;
}

void printTotal(){
    int total = assignmentPoints + examPoints + projectPoints;
    System.out.println("total points er: " + total);
}

void main(){
    addAssignmentPoints(25);
    addExamPoints(40);
    addProjectPoints(30);

    printTotal();
}
 */

/*
// Opgave 3
double applyDiscount(double price, double discountPercent){
    return  price * ( 1 - discountPercent / 100);
}

double addTax(double price){
    return price * 1.25;
}

double calculateFinalPrice(double basePrice, double discount) {
    double priceAfterDiscount = applyDiscount(basePrice, discount);
    double finalPrice = addTax(priceAfterDiscount);
    return finalPrice;
}
void main(){
    double finalPrice = calculateFinalPrice(500, 20);
        System.out.println(finalPrice);
    }
 */
/*
// opgave 4

double calculateAverage(int[] numbers){
    int sum = 0;
    for(int number: numbers){
        sum += number;
    }
    return (double) sum / numbers.length;
}

int findMax(int[] numbers){

    if(){

    }
}

void main(){

}
 */

// Opgave 5

/* Hvis du kører programmet får du en række fejl.
 * Fix programmet så det kan køre
 * outputtet bliver:
 * "7 is the smallest!"
 *
 *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
 */


void main() {

    int a = 7, b = 42;

   int result =  minimum(a,b);
// skrifter tuboklamme med med parantesser og tilføjer et else.
    if (a < b) {
        System.out.println("a is the smallest!");
    } else{
        System.out.println("bigger");
    }

}
// fjener void fordi vi skal retunere noget så skriver int
int minimum(int a, int b) {

    if (a < b) {
        return a;
    } else {
        return b;
    }


}



