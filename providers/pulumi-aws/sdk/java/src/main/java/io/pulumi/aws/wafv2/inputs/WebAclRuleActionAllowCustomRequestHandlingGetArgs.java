// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleActionAllowCustomRequestHandlingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionAllowCustomRequestHandlingGetArgs Empty = new WebAclRuleActionAllowCustomRequestHandlingGetArgs();

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    @Import(name="insertHeaders", required=true)
      private final Output<List<WebAclRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders;

    public Output<List<WebAclRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs>> getInsertHeaders() {
        return this.insertHeaders;
    }

    public WebAclRuleActionAllowCustomRequestHandlingGetArgs(Output<List<WebAclRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders) {
        this.insertHeaders = Objects.requireNonNull(insertHeaders, "expected parameter 'insertHeaders' to be non-null");
    }

    private WebAclRuleActionAllowCustomRequestHandlingGetArgs() {
        this.insertHeaders = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionAllowCustomRequestHandlingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionAllowCustomRequestHandlingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder insertHeaders(Output<List<WebAclRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }
        public Builder insertHeaders(List<WebAclRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs> insertHeaders) {
            this.insertHeaders = Output.of(Objects.requireNonNull(insertHeaders));
            return this;
        }
        public Builder insertHeaders(WebAclRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs... insertHeaders) {
            return insertHeaders(List.of(insertHeaders));
        }        public WebAclRuleActionAllowCustomRequestHandlingGetArgs build() {
            return new WebAclRuleActionAllowCustomRequestHandlingGetArgs(insertHeaders);
        }
    }
}
