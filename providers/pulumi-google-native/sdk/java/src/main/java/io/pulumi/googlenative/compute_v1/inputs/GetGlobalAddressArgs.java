// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlobalAddressArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGlobalAddressArgs Empty = new GetGlobalAddressArgs();

    @InputImport(name="address", required=true)
    private final String address;

    public String getAddress() {
        return this.address;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetGlobalAddressArgs(
        String address,
        @Nullable String project) {
        this.address = Objects.requireNonNull(address, "expected parameter 'address' to be non-null");
        this.project = project;
    }

    private GetGlobalAddressArgs() {
        this.address = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.project = defaults.project;
        }

        public Builder setAddress(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetGlobalAddressArgs build() {
            return new GetGlobalAddressArgs(address, project);
        }
    }
}
