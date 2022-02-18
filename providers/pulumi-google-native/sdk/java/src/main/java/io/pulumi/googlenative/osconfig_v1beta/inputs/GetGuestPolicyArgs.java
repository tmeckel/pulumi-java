// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGuestPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGuestPolicyArgs Empty = new GetGuestPolicyArgs();

    @InputImport(name="guestPolicyId", required=true)
    private final String guestPolicyId;

    public String getGuestPolicyId() {
        return this.guestPolicyId;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetGuestPolicyArgs(
        String guestPolicyId,
        @Nullable String project) {
        this.guestPolicyId = Objects.requireNonNull(guestPolicyId, "expected parameter 'guestPolicyId' to be non-null");
        this.project = project;
    }

    private GetGuestPolicyArgs() {
        this.guestPolicyId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGuestPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String guestPolicyId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGuestPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestPolicyId = defaults.guestPolicyId;
    	      this.project = defaults.project;
        }

        public Builder setGuestPolicyId(String guestPolicyId) {
            this.guestPolicyId = Objects.requireNonNull(guestPolicyId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetGuestPolicyArgs build() {
            return new GetGuestPolicyArgs(guestPolicyId, project);
        }
    }
}
