// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetThemeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetThemeArgs Empty = new GetThemeArgs();

    @InputImport(name="awsAccountId", required=true)
      private final String awsAccountId;

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    @InputImport(name="themeId", required=true)
      private final String themeId;

    public String getThemeId() {
        return this.themeId;
    }

    public GetThemeArgs(
        String awsAccountId,
        String themeId) {
        this.awsAccountId = Objects.requireNonNull(awsAccountId, "expected parameter 'awsAccountId' to be non-null");
        this.themeId = Objects.requireNonNull(themeId, "expected parameter 'themeId' to be non-null");
    }

    private GetThemeArgs() {
        this.awsAccountId = null;
        this.themeId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetThemeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String awsAccountId;
        private String themeId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetThemeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.themeId = defaults.themeId;
        }

        public Builder awsAccountId(String awsAccountId) {
            this.awsAccountId = Objects.requireNonNull(awsAccountId);
            return this;
        }

        public Builder themeId(String themeId) {
            this.themeId = Objects.requireNonNull(themeId);
            return this;
        }
        public GetThemeArgs build() {
            return new GetThemeArgs(awsAccountId, themeId);
        }
    }
}
