public final class Admin implements akun {
    private String username, password;

    @Override
    public void admin() {
        username = "INDONESIA";
        password = "PRATAMA";
    }

    @Override
    public String getUsername() {
        return username;

    }

    @Override
    public String getPassword() {
        return password;
    }
}