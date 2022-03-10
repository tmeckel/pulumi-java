// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetQuickConnectQuickConnectConfigPhoneConfig {
    /**
     * Specifies the phone number in in E.164 format.
     * 
     */
    private final String phoneNumber;

    @OutputCustomType.Constructor
    private GetQuickConnectQuickConnectConfigPhoneConfig(@OutputCustomType.Parameter("phoneNumber") String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Specifies the phone number in in E.164 format.
     * 
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuickConnectQuickConnectConfigPhoneConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQuickConnectQuickConnectConfigPhoneConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        public GetQuickConnectQuickConnectConfigPhoneConfig build() {
            return new GetQuickConnectQuickConnectConfigPhoneConfig(phoneNumber);
        }
    }
}
