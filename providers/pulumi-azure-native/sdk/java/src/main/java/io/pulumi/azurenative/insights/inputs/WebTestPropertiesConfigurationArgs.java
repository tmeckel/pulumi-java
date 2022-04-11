// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An XML configuration specification for a WebTest.
 * 
 */
public final class WebTestPropertiesConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebTestPropertiesConfigurationArgs Empty = new WebTestPropertiesConfigurationArgs();

    /**
     * The XML specification of a WebTest to run against an application.
     * 
     */
    @Import(name="webTest")
      private final @Nullable Output<String> webTest;

    public Output<String> getWebTest() {
        return this.webTest == null ? Codegen.empty() : this.webTest;
    }

    public WebTestPropertiesConfigurationArgs(@Nullable Output<String> webTest) {
        this.webTest = webTest;
    }

    private WebTestPropertiesConfigurationArgs() {
        this.webTest = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebTestPropertiesConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> webTest;

        public Builder() {
    	      // Empty
        }

        public Builder(WebTestPropertiesConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.webTest = defaults.webTest;
        }

        public Builder webTest(@Nullable Output<String> webTest) {
            this.webTest = webTest;
            return this;
        }
        public Builder webTest(@Nullable String webTest) {
            this.webTest = Codegen.ofNullable(webTest);
            return this;
        }        public WebTestPropertiesConfigurationArgs build() {
            return new WebTestPropertiesConfigurationArgs(webTest);
        }
    }
}
