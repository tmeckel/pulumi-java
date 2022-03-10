// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StaticSiteCustomDomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final StaticSiteCustomDomainArgs Empty = new StaticSiteCustomDomainArgs();

    /**
     * The custom domain to create.
     * 
     */
    @InputImport(name="domainName")
      private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of the static site.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Validation method for adding a custom domain
     * 
     */
    @InputImport(name="validationMethod")
      private final @Nullable Input<String> validationMethod;

    public Input<String> getValidationMethod() {
        return this.validationMethod == null ? Input.empty() : this.validationMethod;
    }

    public StaticSiteCustomDomainArgs(
        @Nullable Input<String> domainName,
        @Nullable Input<String> kind,
        Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<String> validationMethod) {
        this.domainName = domainName;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.validationMethod = validationMethod == null ? Input.ofNullable("cname-delegation") : validationMethod;
    }

    private StaticSiteCustomDomainArgs() {
        this.domainName = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.validationMethod = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticSiteCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> domainName;
        private @Nullable Input<String> kind;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> validationMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticSiteCustomDomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.validationMethod = defaults.validationMethod;
        }

        public Builder domainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder domainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder validationMethod(@Nullable Input<String> validationMethod) {
            this.validationMethod = validationMethod;
            return this;
        }

        public Builder validationMethod(@Nullable String validationMethod) {
            this.validationMethod = Input.ofNullable(validationMethod);
            return this;
        }
        public StaticSiteCustomDomainArgs build() {
            return new StaticSiteCustomDomainArgs(domainName, kind, name, resourceGroupName, validationMethod);
        }
    }
}
