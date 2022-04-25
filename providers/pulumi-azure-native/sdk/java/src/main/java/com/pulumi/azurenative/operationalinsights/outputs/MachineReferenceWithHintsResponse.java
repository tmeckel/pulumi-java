// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MachineReferenceWithHintsResponse {
    /**
     * @return Last known display name.
     * 
     */
    private final String displayNameHint;
    /**
     * @return Resource URI.
     * 
     */
    private final String id;
    /**
     * @return Specifies the sub-class of the reference.
     * Expected value is &#39;ref:machinewithhints&#39;.
     * 
     */
    private final String kind;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Last known operating system family.
     * 
     */
    private final String osFamilyHint;
    /**
     * @return Resource type qualifier.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private MachineReferenceWithHintsResponse(
        @CustomType.Parameter("displayNameHint") String displayNameHint,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("osFamilyHint") String osFamilyHint,
        @CustomType.Parameter("type") String type) {
        this.displayNameHint = displayNameHint;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.osFamilyHint = osFamilyHint;
        this.type = type;
    }

    /**
     * @return Last known display name.
     * 
     */
    public String displayNameHint() {
        return this.displayNameHint;
    }
    /**
     * @return Resource URI.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Specifies the sub-class of the reference.
     * Expected value is &#39;ref:machinewithhints&#39;.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Last known operating system family.
     * 
     */
    public String osFamilyHint() {
        return this.osFamilyHint;
    }
    /**
     * @return Resource type qualifier.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineReferenceWithHintsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayNameHint;
        private String id;
        private String kind;
        private String name;
        private String osFamilyHint;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineReferenceWithHintsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayNameHint = defaults.displayNameHint;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.osFamilyHint = defaults.osFamilyHint;
    	      this.type = defaults.type;
        }

        public Builder displayNameHint(String displayNameHint) {
            this.displayNameHint = Objects.requireNonNull(displayNameHint);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder osFamilyHint(String osFamilyHint) {
            this.osFamilyHint = Objects.requireNonNull(osFamilyHint);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public MachineReferenceWithHintsResponse build() {
            return new MachineReferenceWithHintsResponse(displayNameHint, id, kind, name, osFamilyHint, type);
        }
    }
}
