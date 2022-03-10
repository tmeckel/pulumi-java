// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An SMS receiver.
 * 
 */
public final class SmsReceiverArgs extends io.pulumi.resources.ResourceArgs {

    public static final SmsReceiverArgs Empty = new SmsReceiverArgs();

    /**
     * The country code of the SMS receiver.
     * 
     */
    @InputImport(name="countryCode", required=true)
      private final Input<String> countryCode;

    public Input<String> getCountryCode() {
        return this.countryCode;
    }

    /**
     * The name of the SMS receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The phone number of the SMS receiver.
     * 
     */
    @InputImport(name="phoneNumber", required=true)
      private final Input<String> phoneNumber;

    public Input<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public SmsReceiverArgs(
        Input<String> countryCode,
        Input<String> name,
        Input<String> phoneNumber) {
        this.countryCode = Objects.requireNonNull(countryCode, "expected parameter 'countryCode' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
    }

    private SmsReceiverArgs() {
        this.countryCode = Input.empty();
        this.name = Input.empty();
        this.phoneNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmsReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> countryCode;
        private Input<String> name;
        private Input<String> phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(SmsReceiverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCode = defaults.countryCode;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder countryCode(Input<String> countryCode) {
            this.countryCode = Objects.requireNonNull(countryCode);
            return this;
        }

        public Builder countryCode(String countryCode) {
            this.countryCode = Input.of(Objects.requireNonNull(countryCode));
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder phoneNumber(Input<String> phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Input.of(Objects.requireNonNull(phoneNumber));
            return this;
        }
        public SmsReceiverArgs build() {
            return new SmsReceiverArgs(countryCode, name, phoneNumber);
        }
    }
}
