// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PortfolioArgs extends io.pulumi.resources.ResourceArgs {

    public static final PortfolioArgs Empty = new PortfolioArgs();

    /**
     * Description of the portfolio
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the portfolio.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Name of the person or organization who owns the portfolio.
     * 
     */
    @Import(name="providerName", required=true)
      private final Output<String> providerName;

    public Output<String> getProviderName() {
        return this.providerName;
    }

    /**
     * Tags to apply to the connection. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public PortfolioArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        Output<String> providerName,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.name = name;
        this.providerName = Objects.requireNonNull(providerName, "expected parameter 'providerName' to be non-null");
        this.tags = tags;
    }

    private PortfolioArgs() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.providerName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PortfolioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private Output<String> providerName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PortfolioArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.providerName = defaults.providerName;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder providerName(Output<String> providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }
        public Builder providerName(String providerName) {
            this.providerName = Output.of(Objects.requireNonNull(providerName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public PortfolioArgs build() {
            return new PortfolioArgs(description, name, providerName, tags);
        }
    }
}
