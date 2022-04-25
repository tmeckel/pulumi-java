// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KubernetesRoleStorageClassInfoResponse {
    /**
     * @return Storage class name.
     * 
     */
    private final String name;
    /**
     * @return If provisioned storage is posix compliant.
     * 
     */
    private final String posixCompliant;
    /**
     * @return Storage class type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private KubernetesRoleStorageClassInfoResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("posixCompliant") String posixCompliant,
        @CustomType.Parameter("type") String type) {
        this.name = name;
        this.posixCompliant = posixCompliant;
        this.type = type;
    }

    /**
     * @return Storage class name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return If provisioned storage is posix compliant.
     * 
     */
    public String posixCompliant() {
        return this.posixCompliant;
    }
    /**
     * @return Storage class type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesRoleStorageClassInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String posixCompliant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesRoleStorageClassInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.posixCompliant = defaults.posixCompliant;
    	      this.type = defaults.type;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder posixCompliant(String posixCompliant) {
            this.posixCompliant = Objects.requireNonNull(posixCompliant);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public KubernetesRoleStorageClassInfoResponse build() {
            return new KubernetesRoleStorageClassInfoResponse(name, posixCompliant, type);
        }
    }
}
