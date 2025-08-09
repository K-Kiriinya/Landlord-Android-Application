# Landlord-Android-Application

ViewModel
  ensures tenant data survives screen rotations.
  Adds _tenantCount (MutableLiveData<Int>) to track the number of tenants added, updated in addTenant().
  
LiveData and DataBinding
  MutableLiveData<String> (_tenantInfo) to store tenant information as a mutable string.
  Adds _tenantCount (MutableLiveData<Int>) to track the number of tenants added.
  update the UI automatically when data changes.
  Wraps the layout in a <layout> tag to enable DataBinding.
  Sets binding.lifecycleOwner = this to enable LiveData observation in the layout.
  Replaces findViewById with direct access to UI elements via binding (e.g., binding.fullName).

Transformation
  Transformations.map() capitalizes tenant info for display.
