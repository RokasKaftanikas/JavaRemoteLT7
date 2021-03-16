package DesignPatters.chainOfResponsibility;

public interface AuthenticationHandler {
    boolean authenticate(Credentials credentials);
    boolean supports(Class<?> clazz);
}
