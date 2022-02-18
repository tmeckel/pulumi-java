// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirewallArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFirewallArgs Empty = new GetFirewallArgs();

    @InputImport(name="firewall", required=true)
    private final String firewall;

    public String getFirewall() {
        return this.firewall;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetFirewallArgs(
        String firewall,
        @Nullable String project) {
        this.firewall = Objects.requireNonNull(firewall, "expected parameter 'firewall' to be non-null");
        this.project = project;
    }

    private GetFirewallArgs() {
        this.firewall = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String firewall;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewall = defaults.firewall;
    	      this.project = defaults.project;
        }

        public Builder setFirewall(String firewall) {
            this.firewall = Objects.requireNonNull(firewall);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetFirewallArgs build() {
            return new GetFirewallArgs(firewall, project);
        }
    }
}
