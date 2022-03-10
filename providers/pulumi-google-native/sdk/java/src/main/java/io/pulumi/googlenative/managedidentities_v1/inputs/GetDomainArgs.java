// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainArgs Empty = new GetDomainArgs();

    @InputImport(name="domainId", required=true)
      private final String domainId;

    public String getDomainId() {
        return this.domainId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetDomainArgs(
        String domainId,
        @Nullable String project) {
        this.domainId = Objects.requireNonNull(domainId, "expected parameter 'domainId' to be non-null");
        this.project = project;
    }

    private GetDomainArgs() {
        this.domainId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainId = defaults.domainId;
    	      this.project = defaults.project;
        }

        public Builder domainId(String domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetDomainArgs build() {
            return new GetDomainArgs(domainId, project);
        }
    }
}
