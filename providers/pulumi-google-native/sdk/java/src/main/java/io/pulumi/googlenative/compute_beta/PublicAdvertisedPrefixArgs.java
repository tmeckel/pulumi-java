// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_beta.enums.PublicAdvertisedPrefixStatus;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PublicAdvertisedPrefixArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicAdvertisedPrefixArgs Empty = new PublicAdvertisedPrefixArgs();

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
     * The IPv4 address to be used for reverse DNS verification.
     * 
     */
    @Import(name="dnsVerificationIp")
      private final @Nullable Output<String> dnsVerificationIp;

    public Output<String> getDnsVerificationIp() {
        return this.dnsVerificationIp == null ? Codegen.empty() : this.dnsVerificationIp;
    }

    /**
     * The IPv4 address range, in CIDR format, represented by this public advertised prefix.
     * 
     */
    @Import(name="ipCidrRange")
      private final @Nullable Output<String> ipCidrRange;

    public Output<String> getIpCidrRange() {
        return this.ipCidrRange == null ? Codegen.empty() : this.ipCidrRange;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * The status of the public advertised prefix. Possible values include: - `INITIAL`: RPKI validation is complete. - `PTR_CONFIGURED`: User has configured the PTR. - `VALIDATED`: Reverse DNS lookup is successful. - `REVERSE_DNS_LOOKUP_FAILED`: Reverse DNS lookup failed. - `PREFIX_CONFIGURATION_IN_PROGRESS`: The prefix is being configured. - `PREFIX_CONFIGURATION_COMPLETE`: The prefix is fully configured. - `PREFIX_REMOVAL_IN_PROGRESS`: The prefix is being removed.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<PublicAdvertisedPrefixStatus> status;

    public Output<PublicAdvertisedPrefixStatus> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public PublicAdvertisedPrefixArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> dnsVerificationIp,
        @Nullable Output<String> ipCidrRange,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<PublicAdvertisedPrefixStatus> status) {
        this.description = description;
        this.dnsVerificationIp = dnsVerificationIp;
        this.ipCidrRange = ipCidrRange;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.status = status;
    }

    private PublicAdvertisedPrefixArgs() {
        this.description = Codegen.empty();
        this.dnsVerificationIp = Codegen.empty();
        this.ipCidrRange = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicAdvertisedPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> dnsVerificationIp;
        private @Nullable Output<String> ipCidrRange;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<PublicAdvertisedPrefixStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicAdvertisedPrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dnsVerificationIp = defaults.dnsVerificationIp;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.status = defaults.status;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder dnsVerificationIp(@Nullable Output<String> dnsVerificationIp) {
            this.dnsVerificationIp = dnsVerificationIp;
            return this;
        }
        public Builder dnsVerificationIp(@Nullable String dnsVerificationIp) {
            this.dnsVerificationIp = Codegen.ofNullable(dnsVerificationIp);
            return this;
        }
        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            this.ipCidrRange = ipCidrRange;
            return this;
        }
        public Builder ipCidrRange(@Nullable String ipCidrRange) {
            this.ipCidrRange = Codegen.ofNullable(ipCidrRange);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder status(@Nullable Output<PublicAdvertisedPrefixStatus> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable PublicAdvertisedPrefixStatus status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public PublicAdvertisedPrefixArgs build() {
            return new PublicAdvertisedPrefixArgs(description, dnsVerificationIp, ipCidrRange, name, project, requestId, status);
        }
    }
}
