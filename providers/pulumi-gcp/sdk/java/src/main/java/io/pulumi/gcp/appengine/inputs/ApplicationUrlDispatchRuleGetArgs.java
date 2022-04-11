// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationUrlDispatchRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationUrlDispatchRuleGetArgs Empty = new ApplicationUrlDispatchRuleGetArgs();

    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Codegen.empty() : this.domain;
    }

    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    public ApplicationUrlDispatchRuleGetArgs(
        @Nullable Output<String> domain,
        @Nullable Output<String> path,
        @Nullable Output<String> service) {
        this.domain = domain;
        this.path = path;
        this.service = service;
    }

    private ApplicationUrlDispatchRuleGetArgs() {
        this.domain = Codegen.empty();
        this.path = Codegen.empty();
        this.service = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationUrlDispatchRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> domain;
        private @Nullable Output<String> path;
        private @Nullable Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationUrlDispatchRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = Codegen.ofNullable(domain);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }        public ApplicationUrlDispatchRuleGetArgs build() {
            return new ApplicationUrlDispatchRuleGetArgs(domain, path, service);
        }
    }
}
