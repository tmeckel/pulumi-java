// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration specific to LivePerson (https://www.liveperson.com).
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfigArgs Empty = new GoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfigArgs();

    /**
     * Account number of the LivePerson account to connect. This is the account number you input at the login page.
     * 
     */
    @InputImport(name="accountNumber", required=true)
      private final Input<String> accountNumber;

    public Input<String> getAccountNumber() {
        return this.accountNumber;
    }

    public GoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfigArgs(Input<String> accountNumber) {
        this.accountNumber = Objects.requireNonNull(accountNumber, "expected parameter 'accountNumber' to be non-null");
    }

    private GoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfigArgs() {
        this.accountNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountNumber = defaults.accountNumber;
        }

        public Builder accountNumber(Input<String> accountNumber) {
            this.accountNumber = Objects.requireNonNull(accountNumber);
            return this;
        }

        public Builder accountNumber(String accountNumber) {
            this.accountNumber = Input.of(Objects.requireNonNull(accountNumber));
            return this;
        }
        public GoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfigArgs build() {
            return new GoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfigArgs(accountNumber);
        }
    }
}
