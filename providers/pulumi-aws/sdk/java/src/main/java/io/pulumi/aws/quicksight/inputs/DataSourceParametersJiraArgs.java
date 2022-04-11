// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersJiraArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersJiraArgs Empty = new DataSourceParametersJiraArgs();

    /**
     * The base URL of the Jira instance's site to which to connect.
     * 
     */
    @Import(name="siteBaseUrl", required=true)
      private final Output<String> siteBaseUrl;

    public Output<String> getSiteBaseUrl() {
        return this.siteBaseUrl;
    }

    public DataSourceParametersJiraArgs(Output<String> siteBaseUrl) {
        this.siteBaseUrl = Objects.requireNonNull(siteBaseUrl, "expected parameter 'siteBaseUrl' to be non-null");
    }

    private DataSourceParametersJiraArgs() {
        this.siteBaseUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersJiraArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> siteBaseUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersJiraArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteBaseUrl = defaults.siteBaseUrl;
        }

        public Builder siteBaseUrl(Output<String> siteBaseUrl) {
            this.siteBaseUrl = Objects.requireNonNull(siteBaseUrl);
            return this;
        }
        public Builder siteBaseUrl(String siteBaseUrl) {
            this.siteBaseUrl = Output.of(Objects.requireNonNull(siteBaseUrl));
            return this;
        }        public DataSourceParametersJiraArgs build() {
            return new DataSourceParametersJiraArgs(siteBaseUrl);
        }
    }
}
