// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs Empty = new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs();

    /**
     * An array of two-character country codes, for example, [ "US", "CN" ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
     * 
     */
    @InputImport(name="countryCodes", required=true)
      private final Input<List<String>> countryCodes;

    public Input<List<String>> getCountryCodes() {
        return this.countryCodes;
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See Forwarded IP Config below for details.
     * 
     */
    @InputImport(name="forwardedIpConfig")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig;

    public Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> getForwardedIpConfig() {
        return this.forwardedIpConfig == null ? Input.empty() : this.forwardedIpConfig;
    }

    public WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs(
        Input<List<String>> countryCodes,
        @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig) {
        this.countryCodes = Objects.requireNonNull(countryCodes, "expected parameter 'countryCodes' to be non-null");
        this.forwardedIpConfig = forwardedIpConfig;
    }

    private WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs() {
        this.countryCodes = Input.empty();
        this.forwardedIpConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> countryCodes;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCodes = defaults.countryCodes;
    	      this.forwardedIpConfig = defaults.forwardedIpConfig;
        }

        public Builder countryCodes(Input<List<String>> countryCodes) {
            this.countryCodes = Objects.requireNonNull(countryCodes);
            return this;
        }

        public Builder countryCodes(List<String> countryCodes) {
            this.countryCodes = Input.of(Objects.requireNonNull(countryCodes));
            return this;
        }

        public Builder forwardedIpConfig(@Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig) {
            this.forwardedIpConfig = forwardedIpConfig;
            return this;
        }

        public Builder forwardedIpConfig(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs forwardedIpConfig) {
            this.forwardedIpConfig = Input.ofNullable(forwardedIpConfig);
            return this;
        }
        public WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs(countryCodes, forwardedIpConfig);
        }
    }
}
