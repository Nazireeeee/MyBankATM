package com.mybank.atm;
/** Localizable strings for {@link com.mybank.atm}. */
class Bundle {
    /**
     * @return <i>atm</i>
     * @see atmTopComponent
     */
    static String CTL_atmAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_atmAction");
    }
    /**
     * @return <i>atm Window</i>
     * @see atmTopComponent
     */
    static String CTL_atmTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_atmTopComponent");
    }
    /**
     * @return <i>This is a atm window</i>
     * @see atmTopComponent
     */
    static String HINT_atmTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_atmTopComponent");
    }
    private Bundle() {}
}
