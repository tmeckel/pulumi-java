// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3DtmfInputResponse {
    /**
     * The dtmf digits.
     * 
     */
    private final String digits;
    /**
     * The finish digit (if any).
     * 
     */
    private final String finishDigit;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowCxV3DtmfInputResponse(
        @OutputCustomType.Parameter("digits") String digits,
        @OutputCustomType.Parameter("finishDigit") String finishDigit) {
        this.digits = digits;
        this.finishDigit = finishDigit;
    }

    /**
     * The dtmf digits.
     * 
    */
    public String getDigits() {
        return this.digits;
    }
    /**
     * The finish digit (if any).
     * 
    */
    public String getFinishDigit() {
        return this.finishDigit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3DtmfInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String digits;
        private String finishDigit;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3DtmfInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digits = defaults.digits;
    	      this.finishDigit = defaults.finishDigit;
        }

        public Builder digits(String digits) {
            this.digits = Objects.requireNonNull(digits);
            return this;
        }

        public Builder finishDigit(String finishDigit) {
            this.finishDigit = Objects.requireNonNull(finishDigit);
            return this;
        }
        public GoogleCloudDialogflowCxV3DtmfInputResponse build() {
            return new GoogleCloudDialogflowCxV3DtmfInputResponse(digits, finishDigit);
        }
    }
}
