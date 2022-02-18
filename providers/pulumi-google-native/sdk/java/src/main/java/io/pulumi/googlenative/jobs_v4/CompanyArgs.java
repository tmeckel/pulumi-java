// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.jobs_v4.enums.CompanySize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CompanyArgs extends io.pulumi.resources.ResourceArgs {

    public static final CompanyArgs Empty = new CompanyArgs();

    /**
     * The URI to employer's career site or careers page on the employer's web site, for example, "https://careers.google.com".
     * 
     */
    @InputImport(name="careerSiteUri")
    private final @Nullable Input<String> careerSiteUri;

    public Input<String> getCareerSiteUri() {
        return this.careerSiteUri == null ? Input.empty() : this.careerSiteUri;
    }

    /**
     * The display name of the company, for example, "Google LLC".
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Equal Employment Opportunity legal disclaimer text to be associated with all jobs, and typically to be displayed in all roles. The maximum number of allowed characters is 500.
     * 
     */
    @InputImport(name="eeoText")
    private final @Nullable Input<String> eeoText;

    public Input<String> getEeoText() {
        return this.eeoText == null ? Input.empty() : this.eeoText;
    }

    /**
     * Client side company identifier, used to uniquely identify the company. The maximum number of allowed characters is 255.
     * 
     */
    @InputImport(name="externalId", required=true)
    private final Input<String> externalId;

    public Input<String> getExternalId() {
        return this.externalId;
    }

    /**
     * The street address of the company's main headquarters, which may be different from the job location. The service attempts to geolocate the provided address, and populates a more specific location wherever possible in DerivedInfo.headquarters_location.
     * 
     */
    @InputImport(name="headquartersAddress")
    private final @Nullable Input<String> headquartersAddress;

    public Input<String> getHeadquartersAddress() {
        return this.headquartersAddress == null ? Input.empty() : this.headquartersAddress;
    }

    /**
     * Set to true if it is the hiring agency that post jobs for other employers. Defaults to false if not provided.
     * 
     */
    @InputImport(name="hiringAgency")
    private final @Nullable Input<Boolean> hiringAgency;

    public Input<Boolean> getHiringAgency() {
        return this.hiringAgency == null ? Input.empty() : this.hiringAgency;
    }

    /**
     * A URI that hosts the employer's company logo.
     * 
     */
    @InputImport(name="imageUri")
    private final @Nullable Input<String> imageUri;

    public Input<String> getImageUri() {
        return this.imageUri == null ? Input.empty() : this.imageUri;
    }

    /**
     * A list of keys of filterable Job.custom_attributes, whose corresponding `string_values` are used in keyword searches. Jobs with `string_values` under these specified field keys are returned if any of the values match the search keyword. Custom field values with parenthesis, brackets and special symbols are not searchable as-is, and those keyword queries must be surrounded by quotes.
     * 
     */
    @InputImport(name="keywordSearchableJobCustomAttributes")
    private final @Nullable Input<List<String>> keywordSearchableJobCustomAttributes;

    public Input<List<String>> getKeywordSearchableJobCustomAttributes() {
        return this.keywordSearchableJobCustomAttributes == null ? Input.empty() : this.keywordSearchableJobCustomAttributes;
    }

    /**
     * Required during company update. The resource name for a company. This is generated by the service when a company is created. The format is "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for example, "projects/foo/tenants/bar/companies/baz".
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The employer's company size.
     * 
     */
    @InputImport(name="size")
    private final @Nullable Input<CompanySize> size;

    public Input<CompanySize> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    @InputImport(name="tenantId", required=true)
    private final Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId;
    }

    /**
     * The URI representing the company's primary web site or home page, for example, "https://www.google.com". The maximum number of allowed characters is 255.
     * 
     */
    @InputImport(name="websiteUri")
    private final @Nullable Input<String> websiteUri;

    public Input<String> getWebsiteUri() {
        return this.websiteUri == null ? Input.empty() : this.websiteUri;
    }

    public CompanyArgs(
        @Nullable Input<String> careerSiteUri,
        Input<String> displayName,
        @Nullable Input<String> eeoText,
        Input<String> externalId,
        @Nullable Input<String> headquartersAddress,
        @Nullable Input<Boolean> hiringAgency,
        @Nullable Input<String> imageUri,
        @Nullable Input<List<String>> keywordSearchableJobCustomAttributes,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<CompanySize> size,
        Input<String> tenantId,
        @Nullable Input<String> websiteUri) {
        this.careerSiteUri = careerSiteUri;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.eeoText = eeoText;
        this.externalId = Objects.requireNonNull(externalId, "expected parameter 'externalId' to be non-null");
        this.headquartersAddress = headquartersAddress;
        this.hiringAgency = hiringAgency;
        this.imageUri = imageUri;
        this.keywordSearchableJobCustomAttributes = keywordSearchableJobCustomAttributes;
        this.name = name;
        this.project = project;
        this.size = size;
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.websiteUri = websiteUri;
    }

    private CompanyArgs() {
        this.careerSiteUri = Input.empty();
        this.displayName = Input.empty();
        this.eeoText = Input.empty();
        this.externalId = Input.empty();
        this.headquartersAddress = Input.empty();
        this.hiringAgency = Input.empty();
        this.imageUri = Input.empty();
        this.keywordSearchableJobCustomAttributes = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.size = Input.empty();
        this.tenantId = Input.empty();
        this.websiteUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompanyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> careerSiteUri;
        private Input<String> displayName;
        private @Nullable Input<String> eeoText;
        private Input<String> externalId;
        private @Nullable Input<String> headquartersAddress;
        private @Nullable Input<Boolean> hiringAgency;
        private @Nullable Input<String> imageUri;
        private @Nullable Input<List<String>> keywordSearchableJobCustomAttributes;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<CompanySize> size;
        private Input<String> tenantId;
        private @Nullable Input<String> websiteUri;

        public Builder() {
    	      // Empty
        }

        public Builder(CompanyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.careerSiteUri = defaults.careerSiteUri;
    	      this.displayName = defaults.displayName;
    	      this.eeoText = defaults.eeoText;
    	      this.externalId = defaults.externalId;
    	      this.headquartersAddress = defaults.headquartersAddress;
    	      this.hiringAgency = defaults.hiringAgency;
    	      this.imageUri = defaults.imageUri;
    	      this.keywordSearchableJobCustomAttributes = defaults.keywordSearchableJobCustomAttributes;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.size = defaults.size;
    	      this.tenantId = defaults.tenantId;
    	      this.websiteUri = defaults.websiteUri;
        }

        public Builder setCareerSiteUri(@Nullable Input<String> careerSiteUri) {
            this.careerSiteUri = careerSiteUri;
            return this;
        }

        public Builder setCareerSiteUri(@Nullable String careerSiteUri) {
            this.careerSiteUri = Input.ofNullable(careerSiteUri);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setEeoText(@Nullable Input<String> eeoText) {
            this.eeoText = eeoText;
            return this;
        }

        public Builder setEeoText(@Nullable String eeoText) {
            this.eeoText = Input.ofNullable(eeoText);
            return this;
        }

        public Builder setExternalId(Input<String> externalId) {
            this.externalId = Objects.requireNonNull(externalId);
            return this;
        }

        public Builder setExternalId(String externalId) {
            this.externalId = Input.of(Objects.requireNonNull(externalId));
            return this;
        }

        public Builder setHeadquartersAddress(@Nullable Input<String> headquartersAddress) {
            this.headquartersAddress = headquartersAddress;
            return this;
        }

        public Builder setHeadquartersAddress(@Nullable String headquartersAddress) {
            this.headquartersAddress = Input.ofNullable(headquartersAddress);
            return this;
        }

        public Builder setHiringAgency(@Nullable Input<Boolean> hiringAgency) {
            this.hiringAgency = hiringAgency;
            return this;
        }

        public Builder setHiringAgency(@Nullable Boolean hiringAgency) {
            this.hiringAgency = Input.ofNullable(hiringAgency);
            return this;
        }

        public Builder setImageUri(@Nullable Input<String> imageUri) {
            this.imageUri = imageUri;
            return this;
        }

        public Builder setImageUri(@Nullable String imageUri) {
            this.imageUri = Input.ofNullable(imageUri);
            return this;
        }

        public Builder setKeywordSearchableJobCustomAttributes(@Nullable Input<List<String>> keywordSearchableJobCustomAttributes) {
            this.keywordSearchableJobCustomAttributes = keywordSearchableJobCustomAttributes;
            return this;
        }

        public Builder setKeywordSearchableJobCustomAttributes(@Nullable List<String> keywordSearchableJobCustomAttributes) {
            this.keywordSearchableJobCustomAttributes = Input.ofNullable(keywordSearchableJobCustomAttributes);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSize(@Nullable Input<CompanySize> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable CompanySize size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder setTenantId(Input<String> tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Input.of(Objects.requireNonNull(tenantId));
            return this;
        }

        public Builder setWebsiteUri(@Nullable Input<String> websiteUri) {
            this.websiteUri = websiteUri;
            return this;
        }

        public Builder setWebsiteUri(@Nullable String websiteUri) {
            this.websiteUri = Input.ofNullable(websiteUri);
            return this;
        }

        public CompanyArgs build() {
            return new CompanyArgs(careerSiteUri, displayName, eeoText, externalId, headquartersAddress, hiringAgency, imageUri, keywordSearchableJobCustomAttributes, name, project, size, tenantId, websiteUri);
        }
    }
}
