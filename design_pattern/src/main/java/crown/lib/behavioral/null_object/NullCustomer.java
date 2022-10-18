package crown.lib.behavioral.null_object;

/**
 * Description：
 */
class NullCustomer extends AbstractCustomer {

    @Override
    boolean isNil() {
        return true;
    }

    @Override
    String getName() {
        return "Not Available in Customer Database";
    }
}
