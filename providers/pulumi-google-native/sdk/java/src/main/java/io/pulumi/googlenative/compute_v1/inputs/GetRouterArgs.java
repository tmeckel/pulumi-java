// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouterArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRouterArgs Empty = new GetRouterArgs();

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="region", required=true)
    private final String region;

    public String getRegion() {
        return this.region;
    }

    @InputImport(name="router", required=true)
    private final String router;

    public String getRouter() {
        return this.router;
    }

    public GetRouterArgs(
        @Nullable String project,
        String region,
        String router) {
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.router = Objects.requireNonNull(router, "expected parameter 'router' to be non-null");
    }

    private GetRouterArgs() {
        this.project = null;
        this.region = null;
        this.router = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String region;
        private String router;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.router = defaults.router;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRouter(String router) {
            this.router = Objects.requireNonNull(router);
            return this;
        }

        public GetRouterArgs build() {
            return new GetRouterArgs(project, region, router);
        }
    }
}
