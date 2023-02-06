/**
 * @author N'ZO LAGOU
 * 
 * 
 * Créez une classe appelée " Person" qui possède les propriétés suivantes : nom (chaîne), âge (entier) et salaire (double).

Créez un constructeur sans argument pour la Personclasse qui initialise les propriétés aux valeurs par défaut.

Créez un deuxième constructeur pour la Personclasse qui prend trois arguments (nom, âge et salaire) et les affecte aux propriétés correspondantes.

Créez un troisième constructeur qui prend deux arguments (nom et âge) et les affecte aux propriétés correspondantes, définit le salaire sur -1.

Ajoutez une méthode à la Personclasse appelée " displayInfo" qui imprime le nom, l'âge et le salaire de l'objet Person sur la console.

Dans la méthode main de votre programme, créez deux Personobjets : l'un utilisant le constructeur no-arg et l'autre utilisant le second constructeur.

Appelez la displayInfométhode " " sur chacun des Personobjets pour imprimer leurs informations sur la console.

Créez un troisième Personobjet à l'aide du troisième constructeur et appelez la displayInfométhode, vérifiez si le salaire est -1 et imprimez un message disant "Salaire non fourni"
 * 
 */

package daily;

public class Person {
	
	private String name;
	private int age;
	private double salary;

	public Person() {
		super();
		this.name = "";
		this.age = 0;
		this.salary = 0.0;
	}

	public Person(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.salary = -1;
	}

	public void displayInfo() {
		System.out.println("Name: " + this.name + ", Age: " + this.age + ", Salary: " + this.salary);
	}

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("John Doe", 21, 180000);

		person1.displayInfo();
		person2.displayInfo();

		Person person3 = new Person("Adam Leon", 38);
		person3.displayInfo();
		if (person3.salary == -1) {
			System.out.println("Salary not provided");
		}
	}
}
