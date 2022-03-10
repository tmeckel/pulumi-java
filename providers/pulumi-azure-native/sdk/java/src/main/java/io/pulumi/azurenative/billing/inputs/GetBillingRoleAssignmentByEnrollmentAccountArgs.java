// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.billing.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBillingRoleAssignmentByEnrollmentAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBillingRoleAssignmentByEnrollmentAccountArgs Empty = new GetBillingRoleAssignmentByEnrollmentAccountArgs();

    /**
     * The ID that uniquely identifies a billing account.
     * 
     */
    @InputImport(name="billingAccountName", required=true)
      private final String billingAccountName;

    public String getBillingAccountName() {
        return this.billingAccountName;
    }

    /**
     * The ID that uniquely identifies a role assignment.
     * 
     */
    @InputImport(name="billingRoleAssignmentName", required=true)
      private final String billingRoleAssignmentName;

    public String getBillingRoleAssignmentName() {
        return this.billingRoleAssignmentName;
    }

    /**
     * The ID that uniquely identifies an enrollment account.
     * 
     */
    @InputImport(name="enrollmentAccountName", required=true)
      private final String enrollmentAccountName;

    public String getEnrollmentAccountName() {
        return this.enrollmentAccountName;
    }

    public GetBillingRoleAssignmentByEnrollmentAccountArgs(
        String billingAccountName,
        String billingRoleAssignmentName,
        String enrollmentAccountName) {
        this.billingAccountName = Objects.requireNonNull(billingAccountName, "expected parameter 'billingAccountName' to be non-null");
        this.billingRoleAssignmentName = Objects.requireNonNull(billingRoleAssignmentName, "expected parameter 'billingRoleAssignmentName' to be non-null");
        this.enrollmentAccountName = Objects.requireNonNull(enrollmentAccountName, "expected parameter 'enrollmentAccountName' to be non-null");
    }

    private GetBillingRoleAssignmentByEnrollmentAccountArgs() {
        this.billingAccountName = null;
        this.billingRoleAssignmentName = null;
        this.enrollmentAccountName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBillingRoleAssignmentByEnrollmentAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingAccountName;
        private String billingRoleAssignmentName;
        private String enrollmentAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBillingRoleAssignmentByEnrollmentAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountName = defaults.billingAccountName;
    	      this.billingRoleAssignmentName = defaults.billingRoleAssignmentName;
    	      this.enrollmentAccountName = defaults.enrollmentAccountName;
        }

        public Builder billingAccountName(String billingAccountName) {
            this.billingAccountName = Objects.requireNonNull(billingAccountName);
            return this;
        }

        public Builder billingRoleAssignmentName(String billingRoleAssignmentName) {
            this.billingRoleAssignmentName = Objects.requireNonNull(billingRoleAssignmentName);
            return this;
        }

        public Builder enrollmentAccountName(String enrollmentAccountName) {
            this.enrollmentAccountName = Objects.requireNonNull(enrollmentAccountName);
            return this;
        }
        public GetBillingRoleAssignmentByEnrollmentAccountArgs build() {
            return new GetBillingRoleAssignmentByEnrollmentAccountArgs(billingAccountName, billingRoleAssignmentName, enrollmentAccountName);
        }
    }
}
