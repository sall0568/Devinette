void main() {
    // 1. Générer un nombre aléatoire entre 1 et 100
    int nombreAleatoire = (int) (Math.random() * 100) + 1;

    // 2. Scanner pour lire les entrées utilisateur
    Scanner scanner = new Scanner(System.in);

    // 3. Nombre d'essais maximum
    int essaisMax = 10;
    int nombreEssais = 0;
    boolean aGagne = false;

    IO.println("J'ai choisi un nombre entre 1 et 100.");
    IO.println("Tu as " + essaisMax + " essais pour le trouver.");

    // 4. Boucle des essais
    while (nombreEssais < essaisMax && !aGagne) {
        IO.print("Essai n°" + (nombreEssais + 1) + " : ");
        int proposition = scanner.nextInt();
        nombreEssais++;

        if (proposition == nombreAleatoire) {
            aGagne = true;
            IO.println("Bravo ! Tu as trouvé le nombre " + nombreAleatoire + " en " + nombreEssais + " essais !");
        } else if (proposition < nombreAleatoire) {
            IO.println("Nombre proposé plus grand");
        } else {
            IO.println("Nombre proposé plus petit");
        }
    }

    // 5. Si l'utilisateur n'a pas gagné
    if (!aGagne) {
        IO.println("Dommage ! Tu as utilisé tes " + essaisMax + " essais.");
        IO.println("Le nombre à deviner était : " + nombreAleatoire);
    }

    scanner.close();
}
