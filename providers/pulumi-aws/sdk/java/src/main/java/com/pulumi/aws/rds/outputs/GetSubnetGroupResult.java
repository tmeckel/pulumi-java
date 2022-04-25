// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubnetGroupResult {
    /**
     * @return The Amazon Resource Name (ARN) for the DB subnet group.
     * 
     */
    private final String arn;
    /**
     * @return Provides the description of the DB subnet group.
     * 
     */
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * @return Provides the status of the DB subnet group.
     * 
     */
    private final String status;
    /**
     * @return Contains a list of subnet identifiers.
     * 
     */
    private final List<String> subnetIds;
    /**
     * @return Provides the VPC ID of the subnet group.
     * 
     */
    private final String vpcId;

    @CustomType.Constructor
    private GetSubnetGroupResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.arn = arn;
        this.description = description;
        this.id = id;
        this.name = name;
        this.status = status;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    /**
     * @return The Amazon Resource Name (ARN) for the DB subnet group.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Provides the description of the DB subnet group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Provides the status of the DB subnet group.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Contains a list of subnet identifiers.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * @return Provides the VPC ID of the subnet group.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String description;
        private String id;
        private String name;
        private String status;
        private List<String> subnetIds;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }        public GetSubnetGroupResult build() {
            return new GetSubnetGroupResult(arn, description, id, name, status, subnetIds, vpcId);
        }
    }
}
