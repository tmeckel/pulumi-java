// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * UrlMaps A host-matching rule for a URL. If matched, will use the named PathMatcher to select the BackendService.
 * 
 */
public final class HostRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostRuleArgs Empty = new HostRuleArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or .. * based matching is not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @Import(name="hosts")
      private final @Nullable Output<List<String>> hosts;

    public Output<List<String>> getHosts() {
        return this.hosts == null ? Codegen.empty() : this.hosts;
    }

    /**
     * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
     * 
     */
    @Import(name="pathMatcher")
      private final @Nullable Output<String> pathMatcher;

    public Output<String> getPathMatcher() {
        return this.pathMatcher == null ? Codegen.empty() : this.pathMatcher;
    }

    public HostRuleArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<String>> hosts,
        @Nullable Output<String> pathMatcher) {
        this.description = description;
        this.hosts = hosts;
        this.pathMatcher = pathMatcher;
    }

    private HostRuleArgs() {
        this.description = Codegen.empty();
        this.hosts = Codegen.empty();
        this.pathMatcher = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> hosts;
        private @Nullable Output<String> pathMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(HostRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hosts = defaults.hosts;
    	      this.pathMatcher = defaults.pathMatcher;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder hosts(@Nullable Output<List<String>> hosts) {
            this.hosts = hosts;
            return this;
        }
        public Builder hosts(@Nullable List<String> hosts) {
            this.hosts = Codegen.ofNullable(hosts);
            return this;
        }
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }
        public Builder pathMatcher(@Nullable Output<String> pathMatcher) {
            this.pathMatcher = pathMatcher;
            return this;
        }
        public Builder pathMatcher(@Nullable String pathMatcher) {
            this.pathMatcher = Codegen.ofNullable(pathMatcher);
            return this;
        }        public HostRuleArgs build() {
            return new HostRuleArgs(description, hosts, pathMatcher);
        }
    }
}
