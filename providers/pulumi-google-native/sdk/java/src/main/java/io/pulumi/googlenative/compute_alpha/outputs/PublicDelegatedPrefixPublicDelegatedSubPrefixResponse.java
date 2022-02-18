// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PublicDelegatedPrefixPublicDelegatedSubPrefixResponse {
    /**
     * Name of the project scoping this PublicDelegatedSubPrefix.
     * 
     */
    private final String delegateeProject;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * The IPv4 address range, in CIDR format, represented by this sub public delegated prefix.
     * 
     */
    private final String ipCidrRange;
    /**
     * Whether the sub prefix is delegated to create Address resources in the delegatee project.
     * 
     */
    private final Boolean isAddress;
    /**
     * The name of the sub public delegated prefix.
     * 
     */
    private final String name;
    /**
     * The region of the sub public delegated prefix if it is regional. If absent, the sub prefix is global.
     * 
     */
    private final String region;
    /**
     * The status of the sub public delegated prefix.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"delegateeProject","description","ipCidrRange","isAddress","name","region","status"})
    private PublicDelegatedPrefixPublicDelegatedSubPrefixResponse(
        String delegateeProject,
        String description,
        String ipCidrRange,
        Boolean isAddress,
        String name,
        String region,
        String status) {
        this.delegateeProject = Objects.requireNonNull(delegateeProject);
        this.description = Objects.requireNonNull(description);
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
        this.isAddress = Objects.requireNonNull(isAddress);
        this.name = Objects.requireNonNull(name);
        this.region = Objects.requireNonNull(region);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * Name of the project scoping this PublicDelegatedSubPrefix.
     * 
     */
    public String getDelegateeProject() {
        return this.delegateeProject;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The IPv4 address range, in CIDR format, represented by this sub public delegated prefix.
     * 
     */
    public String getIpCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * Whether the sub prefix is delegated to create Address resources in the delegatee project.
     * 
     */
    public Boolean getIsAddress() {
        return this.isAddress;
    }
    /**
     * The name of the sub public delegated prefix.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The region of the sub public delegated prefix if it is regional. If absent, the sub prefix is global.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * The status of the sub public delegated prefix.
     * 
     */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicDelegatedPrefixPublicDelegatedSubPrefixResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String delegateeProject;
        private String description;
        private String ipCidrRange;
        private Boolean isAddress;
        private String name;
        private String region;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicDelegatedPrefixPublicDelegatedSubPrefixResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegateeProject = defaults.delegateeProject;
    	      this.description = defaults.description;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.isAddress = defaults.isAddress;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.status = defaults.status;
        }

        public Builder setDelegateeProject(String delegateeProject) {
            this.delegateeProject = Objects.requireNonNull(delegateeProject);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setIpCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder setIsAddress(Boolean isAddress) {
            this.isAddress = Objects.requireNonNull(isAddress);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public PublicDelegatedPrefixPublicDelegatedSubPrefixResponse build() {
            return new PublicDelegatedPrefixPublicDelegatedSubPrefixResponse(delegateeProject, description, ipCidrRange, isAddress, name, region, status);
        }
    }
}
