class Check {
    private void prove() {
        System.out.println("Account is private");
    }
}

class Private_test {
    public static void main(String[] args) {
        prove p = new prove();
        p.prove();
    }
}