class count_prime {

    public int countPrimes(int n) {
        if (n < 3)//5
            return 0;

        boolean[] prime = new boolean[n];
        int count = 0;
        for (int i = 3; i * i < n; i += 2) {
            if (prime[i])
                continue;

            for (int j = i * i; j < n; j += 2 * i) {
                if (!prime[j]) {
                    --count;
                    prime[j] = true;
                }
            }
        }
        System.out.println(count);

        return count;
    }
}

