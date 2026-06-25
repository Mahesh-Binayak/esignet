package io.mosip.esignet.core;

/**
 * Intentionally broken source file used to demonstrate the PR Gate FAILING.
 * The method body below has a deliberate syntax error so `mvn compile` fails.
 * Delete this file after the demo.
 */
public class DemoFailGate {

    public int broken() {
        int x =   // deliberate syntax error: missing right-hand side + semicolon
        return x;
    }
}
